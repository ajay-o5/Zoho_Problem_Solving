class Box<T>{
	    private T value;

	    public Box(T value) {
	        this.value = value;
	    }

	    public T getValue() {
	        return value;
	    }

	    public void printValue() {
	        System.out.println("Stored Value: " + value);
	    }
	}

	public class genericlass {
	    public static void main(String[] args) {
	        Box<String> stringBox = new Box<>("Hello Zoho");
	        stringBox.printValue();
	        Box<Integer> intBox = new Box<>(29);
	        intBox.printValue(); 
	        Box<Double> doubleBox = new Box<>(6.56);
	        doubleBox.printValue(); 
	    }
	}
