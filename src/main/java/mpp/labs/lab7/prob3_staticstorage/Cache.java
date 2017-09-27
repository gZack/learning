package mpp.labs.lab7.prob3_staticstorage;

public interface Cache {
	//shouldn't be static
	default long timeout() {
		//seconds
		return 1;
	}
}
