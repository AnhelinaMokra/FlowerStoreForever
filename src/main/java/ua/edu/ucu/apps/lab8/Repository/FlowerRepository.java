package ua.edu.ucu.apps.lab8.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.edu.ucu.apps.lab8.Model.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Repository> {
}