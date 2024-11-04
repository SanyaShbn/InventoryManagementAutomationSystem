package by.shubinalex.inventorymanagmentautomationsystem.repository;

import by.shubinalex.inventorymanagmentautomationsystem.entity.DeliveredGoods;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DeliveredGoodsRepository extends CrudRepository<DeliveredGoods, Long> {
}
