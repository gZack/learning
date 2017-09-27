package mpp.lab5.prob4.personbirthinfo.personinfo;

final class PersonBirthInfoImpl implements PersonBirthInfo {

    Person person;
    BirthInfo birthInfo;

    PersonBirthInfoImpl(final Person person, final BirthInfo birthInfo){
        this.birthInfo = birthInfo;
        this.person = person;
        birthInfo.setPerson(person);
        person.setBirthInfo(birthInfo);
    }

    @Override
    public Person getPerson() {
        return person;
    }

    @Override
    public BirthInfo getBirthInfo() {
        return birthInfo;
    }
}
