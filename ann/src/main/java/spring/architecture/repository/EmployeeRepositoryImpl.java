package spring.architecture.repository;

public class EmployeeRepositoryImpl implements IEmployeeRepository {
    @Override
    public void getInfo() {
        System.out.println("Hi! I am employee!");
    }
}
