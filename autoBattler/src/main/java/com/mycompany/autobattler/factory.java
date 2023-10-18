import java.util.ArrayDeque;
import java.util.Deque;

// Define a class to represent objects with health, damage, and cost
class GameObject {
    private int health;
    private int damage;
    private int cost;

    public GameObject(int health, int damage, int cost) {
        this.health = health;
        this.damage = damage;
        this.cost = cost;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Health: " + health + ", Damage: " + damage + ", Cost: " + cost;
    }
}

public class factory {
    public static void main(String[] args) {
        // Create a deque (ArrayDeque in this example)
        Deque<GameObject> deque = new ArrayDeque<>();

        // Insert instances of GameObject into the deque
        GameObject obj1 = new GameObject(100, 20, 50);
        GameObject obj2 = new GameObject(150, 30, 75);

        // Insert at the end of the deque
        deque.addLast(obj1);

        // Insert at the beginning of the deque
        deque.addFirst(obj2);

        // Print the contents of the deque
        for (GameObject gameObject : deque) {
            System.out.println(gameObject);
        }
    }
}
//In this example, we define a GameObject class to represent objects with health, damage, and cost attributes. We then create instances of this class (obj1 and obj2) and insert them into the Deque. Finally, we print the contents of the Deque to display the attributes of the objects stored in it.





