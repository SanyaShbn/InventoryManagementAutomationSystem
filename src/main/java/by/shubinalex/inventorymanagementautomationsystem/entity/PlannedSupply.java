package by.shubinalex.inventorymanagementautomationsystem.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlannedSupply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private int quantity;

    private LocalDate plannedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private Vendor vendor;
}
