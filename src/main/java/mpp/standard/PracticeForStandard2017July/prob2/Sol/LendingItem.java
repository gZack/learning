package mpp.standard.PracticeForStandard2017July.prob2.Sol;

public class LendingItem {
	private int numCopiesInLib;

	public int getNumCopiesInLib() {
		return numCopiesInLib;
	}

	public void setNumCopiesInLib(int numCopiesInLib) {
		this.numCopiesInLib = numCopiesInLib;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numCopiesInLib;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LendingItem other = (LendingItem) obj;
		if (numCopiesInLib != other.numCopiesInLib)
			return false;
		return true;
	}
	
	
	
}
