package by.shubinalex.inventorymanagementautomationsystem.repository;

import by.shubinalex.inventorymanagementautomationsystem.entity.CurrentExpenses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CurrentExpensesRepository extends CrudRepository<CurrentExpenses, Long> {
}
