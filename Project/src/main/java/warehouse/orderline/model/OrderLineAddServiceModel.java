package warehouse.orderline.model;

import warehouse.items.model.ItemAddBindingModel;
import warehouse.items.model.ItemAddServiceModel;
import warehouse.validated.OnCreate;
import warehouse.validated.OnCreateOrder;
import warehouse.validated.OnUpdate;
import warehouse.validated.OnUpdateOrder;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.math.BigDecimal;

public class OrderLineAddServiceModel {

    private Long id;
    private ItemAddServiceModel item;
    private int quantity;
    private BigDecimal subtotal;

    @Null(groups = OnCreate.class)
    @NotNull(groups = OnUpdate.class)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Valid
    public ItemAddServiceModel getItem() {
        return item;
    }

    public void setItem(ItemAddServiceModel item) {
        this.item = item;
    }

    @Min(value = 1, message = "Quantity must be greater than 0")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @DecimalMin(value = "0", message = "Subtotal must be greater than 0")
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }
}
