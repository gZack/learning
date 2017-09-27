package mpp.lab5.prob4.personbirthinfo.personinfo;

import java.time.LocalDate;

final public class PersonBirthInfoFactory {
    private PersonBirthInfoFactory(){}

    public static PersonBirthInfo createPersonAndBirthInfo(final String name,
                                                           final LocalDate dob){
        Person person = new Person(name);
        BirthInfo birthInfo = new BirthInfo(dob);

        return new PersonBirthInfoImpl(person,birthInfo);
    }
}
