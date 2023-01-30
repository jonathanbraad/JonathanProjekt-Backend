package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "boat")
public class Boat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBoat", nullable = false)
    private Integer id;

    @Size(max = 45)
    @Column(name = "name", length = 45)
    private String name;

    @Size(max = 45)
    @Column(name = "brand", length = 45)
    private String brand;

    @Column(name = "image")
    private byte[] image;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Owner_idOwner", nullable = false)
    private Owner ownerIdowner;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Harbour_idHarbour", nullable = false)
    private Harbour harbourIdharbour;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Owner getOwnerIdowner() {
        return ownerIdowner;
    }

    public void setOwnerIdowner(Owner ownerIdowner) {
        this.ownerIdowner = ownerIdowner;
    }

    public Harbour getHarbourIdharbour() {
        return harbourIdharbour;
    }

    public void setHarbourIdharbour(Harbour harbourIdharbour) {
        this.harbourIdharbour = harbourIdharbour;
    }

}