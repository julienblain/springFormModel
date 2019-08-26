package formation;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Override
    public void add(Student student) {
        //Persist the user object here. 
        System.out.println("Student added successfully");

    }

    @Override
    public List getAllCountries() {
        List countryList = new ArrayList();
        countryList.add(new Country(1, "India"));
        countryList.add(new Country(2, "USA"));
        countryList.add(new Country(3, "UK"));
        return countryList;
    }

    @Override
    public List getAllInterets() {
        List interestList = new ArrayList();
        interestList.add(new Interest("Spring", "Spring"));
        interestList.add(new Interest("Hibernate", "Hibernate"));
        interestList.add(new Interest("Java", "Java"));
        return interestList;
    }

}
