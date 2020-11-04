package ua.lviv.iot.office.equipment.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.office.equipment.model.Mouse;

@Repository
public interface MouseRepository extends JpaRepository<Mouse, Integer> {

}
