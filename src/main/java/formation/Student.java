/*
 * 
 */
package formation;

import java.util.List;

/**
 *
 * @author D. Colombani <dc@webformation.fr>
 */
public class Student {

    private Integer age;
    private String name;
    private Integer id;
    private String country;
    private String[] interestList;

    /**
     * Get the value of interestList
     *
     * @return the value of interestList
     */
    public String[] getInterestList() {
        return interestList;
    }

    /**
     * Set the value of interestList
     *
     * @param interestList new value of interestList
     */
    public void setInterestList(String[] interestList) {
        this.interestList = interestList;
    }
    /**
     * Get the value of interestList at specified index
     *
     * @param index the index of interestList
     * @return the value of interestList at specified index
     */
    public String getInterestList(int index) {
        return this.interestList[index];
    }

    /**
     * Set the value of interestList at specified index.
     *
     * @param index the index of interestList
     * @param interestList new value of interestList at specified index
     */
    public void setInterestList(int index, String interestList) {
        this.interestList[index] = interestList;
    }


    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
    	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
