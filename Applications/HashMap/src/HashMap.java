
public class HashMap<K, V> {

	private static final int INITIAL_SIZE = 1 << 4;
	private static final int MAXIMUM_CAPACITY = 1 << 30;

	Node[] hashTable;

	HashMap() {
		hashTable = new Node[INITIAL_SIZE];
	}

	HashMap(int custom_size) {
		int computedSize = computeSizeForTable(custom_size);
		hashTable = new Node[computedSize];
	}

	private int computeSizeForTable(int cap) {
		int n = cap - 1;
		n |= n >>> 1;
		n |= n >>> 2;
		n |= n >>> 4;
		n |= n >>> 8;
		n |= n >>> 16;

		return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
	}

	class Node<K, V> {
		K key;
		V value;

		Node next;

		Node(K k, V v) {
			key = k;
			value = v;
		}

		public K getKey() {
			return key;
		}

		public void setKey(K key) {
			this.key = key;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}

	}

	public void put(K key, V value) {
		int hashCode = key.hashCode() % hashTable.length;
		Node node = hashTable[hashCode];

		if (node == null) {
			Node newNode = new Node(key, value);
			hashTable[hashCode] = newNode;
		} else {
			Node prev = node;
			while (node != null) {
				if (node.key == key) {
					node.value = value;
					return;
				}
				node = node.next;
				prev = prev.next;
			}
			Node newNode = new Node(key, value);
			prev.next = newNode;
		}

	}

	public V get(K key) {
		int hashCode = key.hashCode() % hashTable.length;
		Node node = hashTable[hashCode];

		while (node != null) {
			if (node.key.equals(key))
				return (V) node.value;
			node = node.next;
		}
		return null;
	}
}
