package by.shubinalex.inventorymanagmentautomationsystem.repository;

import by.shubinalex.inventorymanagmentautomationsystem.entity.VendorCredit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VendorCreditRepository extends CrudRepository<VendorCredit, Long>{
}