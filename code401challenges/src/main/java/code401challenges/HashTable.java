package code401challenges;

public class HashTable {

    // Resource: http://math.hws.edu/eck/cs124/javanotes4/c12/ex-12-3-answer.html
    //Notes:
    // 1. a hash table is just an array of linked lists.
    // 2. each linked list holds all the items in the table that share the same hash code.
    // 3. initially, all the lists are empty
    // 4. the order of items in the list doesn't matter

    static private class ListNode {
        // Keys that have the same hash code are placed together
        // in a linked list.  This private nested class is used
        // internally to implement linked lists.  A ListNode
        // holds a (key,value) pair.
        Object key;
        Object value;
        ListNode next;  // Pointer to next node in the list;
        // A null marks the end of the list.
    }

    public ListNode[] table;

    private int count;

    // constructors
    public HashTable() {
        // Create a hash table with an initial size of 64.
        table = new ListNode[64];
    }

    public HashTable(int initialSize) {
        // Create a hash table with a specified initial size.
        // Precondition: initalSize > 0.
        table = new ListNode[initialSize];
    }

    //add: takes in both the key and value.
    // This method should hash the key, and add the key and value pair to the table, handling collisions as needed.

    public void put(Object key, Object value) {
        // Associate the specified value with the specified key.
        // Precondition:  The key is not null.
        int locationIdx = hash(key); // Which location should this key be in?
        ListNode list = table[locationIdx]; // grab the list data stored in that location
        while (list != null) {
            // Search the nodes in the list, to see if the key already exists.
            if (list.key.equals(key))
                break;
            list = list.next;
        }
        // At this point, either list is null, or list.key.equals(key).
        if (list != null) {
            // Since list is not null, we have found the key.
            // Just change the associated value.
            list.value = value;
        }
        else {
            // Since list == null, the key is not already in the list.
            // Add a new node at the head of the list to contain the
            // new key and its associated value.
            if (count >= 0.75*table.length) {
                // The table is becoming too full.  Increase its size
                // before adding the new node.
                resize();
            }
            // make a new node with the values passed into the method
            ListNode newNode = new ListNode();
            newNode.key = key;
            newNode.value = value;
            // since list==null assign null to the the next property of the node being added
            newNode.next = table[locationIdx];
            // now, assign the new node as the head of the list at the appropriate location
            table[locationIdx] = newNode;
            count++;  // Count the newly added key.
        }
    }

    //get: takes in the key and returns the value from the table.
    public Object get(Object key) {
        // Retrieve the value associated with the specified key
        // in the table, if there is any.  If not, the value
        // null will be returned.
        int locationIdx = hash(key);  // At what location should the key be?
        ListNode list = table[locationIdx];  // For traversing the list.
        while (list != null) {
            // Check if the specified key is in the node that
            // list points to.  If so, return the associated value.
            if (list.key.equals(key))
                return list.value;
            list = list.next;  // Move on to next node in the list.
        }
        // If we get to this point, then we have looked at every
        // node in the list without finding the key.  Return
        // the value null to indicate that the key is not in the table.
        return null;
    }

    //contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
    public boolean containsKey(Object key) {
        // Test whether the specified key has an associated value
        // in the table.
        int locationIdx = hash(key);  // In what location should key be?
        ListNode list = table[locationIdx];  // For traversing the list.
        while (list != null) {
            // If we find the key in this node, return true.
            if (list.key.equals(key))
                return true;
            list = list.next;
        }
        // If we get to this point, we know that the key does
        // not exist in the table.
        return false;
    }

    //hash: takes in an arbitrary key and returns an index in the collection.
    public int hash(Object key) {
        // Compute a hash code for the key; key cannot be null.
        // The hash code depends on the size of the table as
        // well as on the value returned by key.hashCode().
        return (Math.abs(key.hashCode())) % table.length;
    }

    private void resize() {
        // Double the size of the table, and redistribute the
        // key/value pairs to their proper locations in the
        // new table.
        ListNode[] newtable = new ListNode[table.length*2];
        for (int i = 0; i < table.length; i++) {
            // Move all the nodes in linked list number i
            // into the new table.  No new ListNodes are
            // created.  The existing ListNode for each
            // key/value pair is moved to the newtable.
            // This is done by changing the "next" pointer
            // in the node and by making a pointer in the
            // new table point to the node.
            ListNode list = table[i]; // For traversing linked list number i.
            while (list != null) {
                // Move the node pointed to by list to the new table.
                ListNode next = list.next;  // The is the next node in the list.
                // Remember it, before changing
                // the value of list!
                int hash = (Math.abs(list.key.hashCode())) % newtable.length;
                // hash is the hash code of list.key that is
                // appropriate for the new table size.  The
                // next two lines add the node pointed to by list
                // onto the head of the linked list in the new table
                // at position number hash.
                list.next = newtable[hash];
                newtable[hash] = list;
                list = next;  // Move on to the next node in the OLD table.
            }
        }
        table = newtable;  // Replace the table with the new table.
    }
}
