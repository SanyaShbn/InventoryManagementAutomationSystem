package by.shubinalex.inventorymanagementautomationsystem.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SupplyOrder { // Эта сущность помогает отслеживать заказы на поставки, их даты и ожидаемые даты доставки
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderNumber;

    private LocalDate orderDate;

    private LocalDate expectedDeliveryDate;

    @ManyToOne
    private Vendor vendor;

    @OneToMany(mappedBy = "supplyOrder")
    private List<DeliveredGoods> deliveredGoods = new ArrayList<>();

}
