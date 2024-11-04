package by.shubinalex.inventorymanagmentautomationsystem.repository;

import by.shubinalex.inventorymanagmentautomationsystem.entity.SupplyOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SupplyOrderRepository extends CrudRepository<SupplyOrder, Long> {
}
