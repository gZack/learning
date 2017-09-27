package mpp.lab5.prob4.personbirthinfo.personinfo;

final public class Person {
	private String name;
	private BirthInfo birthInfo;
	Person(String name) {
		this.name = name;
	}

	public BirthInfo getBirthInfo() {
		return birthInfo;
	}

	public String getName() {
		return name;
	}
	void setBirthInfo(BirthInfo birthInfo){
		this.birthInfo = birthInfo;
	}

	@Override
	public String toString() {
		return name;
	}
}
