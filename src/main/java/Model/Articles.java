package Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Articles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String FIO,subject,topic,text;

    public String getText() {
        return text;
    }
}