package by.shubinalex.inventorymanagmentautomationsystem.repository;

import by.shubinalex.inventorymanagmentautomationsystem.entity.VendorInvoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VendorInvoiceRepository extends CrudRepository<VendorInvoice, Long> {
}
