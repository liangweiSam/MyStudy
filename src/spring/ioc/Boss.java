package spring.ioc;


import java.util.*;

/**
 * Created by a on 2017/5/31.
 */
public class Boss {

    private Set<String> name = new HashSet<String>();
    private Map<Integer, String> resources = new HashMap<>();
    private List<String> employee = new ArrayList<>();

    public Set<String> getName() {
        return name;
    }

    public void setName(Set<String> name) {
        this.name = name;
    }

    public Map<Integer, String> getResources() {
        return resources;
    }

    public void setResources(Map<Integer, String> resources) {
        this.resources = resources;
    }

    public List<String> getEmployee() {
        return employee;
    }

    public void setEmployee(List<String> employee) {
        this.employee = employee;
    }
}
