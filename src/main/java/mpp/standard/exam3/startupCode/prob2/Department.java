package mpp.standard.exam3.startupCode.prob2;

public abstract class Department {
	private StringQueue queue = new StringQueue();
	public StringQueue getQueue() {
		return queue;
	}
	//implement

	public void addMessage(String msg){
		queue.enqueue(msg);
	}

	public String nextMessage() throws EmptyQueueException {
		return queue.dequeue();
	}

	public abstract String getName();
}
