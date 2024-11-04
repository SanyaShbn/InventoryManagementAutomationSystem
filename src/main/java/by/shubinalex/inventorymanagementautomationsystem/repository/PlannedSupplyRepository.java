package by.shubinalex.inventorymanagementautomationsystem.repository;

import by.shubinalex.inventorymanagementautomationsystem.entity.PlannedSupply;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PlannedSupplyRepository extends CrudRepository<PlannedSupply, Long> {
}
