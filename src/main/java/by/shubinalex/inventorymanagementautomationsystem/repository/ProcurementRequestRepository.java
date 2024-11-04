package by.shubinalex.inventorymanagementautomationsystem.repository;

import by.shubinalex.inventorymanagementautomationsystem.entity.ProcurementRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProcurementRequestRepository extends CrudRepository<ProcurementRequest, Long> {
}