package mpp.demos.lecture5.factorymethods4.singleton;

public class MySingleton {
	public static int countInstances = 0;
	private static MySingleton instance;
	private MySingleton() {
		++countInstances;
	}
	public static MySingleton getInstance() {
		if(instance == null){
			instance = new MySingleton();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 20; ++i) {
			getInstance();
		}
		System.out.println(MySingleton.countInstances);
	}
}


