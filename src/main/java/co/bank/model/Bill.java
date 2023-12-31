package co.bank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill implements Serializable {
    private Integer id;
    private Date billDate;
    private Integer userId;
    private Double value;
    private Integer type;
    private String observation;

    public Bill(Date billDate, Double value, Integer type, String observation) {
        this.billDate = billDate;
        this.value = value;
        this.type = type;
        this.observation = observation;
    }
}
