package mpp.lab5.prob4.personbirthinfo;

import mpp.lab5.prob4.personbirthinfo.db.Database;
import mpp.lab5.prob4.personbirthinfo.db.PersonBirthRecord;
import mpp.lab5.prob4.personbirthinfo.personinfo.BirthInfo;
import mpp.lab5.prob4.personbirthinfo.personinfo.Person;
import mpp.lab5.prob4.personbirthinfo.personinfo.PersonBirthInfo;
import mpp.lab5.prob4.personbirthinfo.personinfo.PersonBirthInfoFactory;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        //String formattedString = localDate.format(formatter);

        List<Person> people = new ArrayList<>();
        List<BirthInfo> birthInfos = new ArrayList<>();

        for (PersonBirthRecord rec: Database.h.values()
             ) {
            PersonBirthInfo birthInfo = PersonBirthInfoFactory
                    .createPersonAndBirthInfo(rec.getName(),rec.getDob());
            birthInfos.add(birthInfo.getBirthInfo());
            people.add(birthInfo.getPerson());

            /*System.out.println(String.format("%s's birth date is %s",
                    birthInfo.getPerson().getName(),
                    birthInfo.getBirthInfo().getDateOfBirth().format(formatter)));*/

        }

        for (Person person : people){
            System.out.println(person);
        }
    }
}
