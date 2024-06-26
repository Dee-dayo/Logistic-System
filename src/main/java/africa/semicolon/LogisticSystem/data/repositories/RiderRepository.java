package africa.semicolon.LogisticSystem.data.repositories;

import africa.semicolon.LogisticSystem.data.models.Rider;
import africa.semicolon.LogisticSystem.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RiderRepository extends MongoRepository<Rider,String> {
    List<Rider> findByIsAvailableTrue();
//    Rider findByOrder();

    boolean existsByPhoneNumber(String phoneNumber);

    Rider findByPhoneNumber(String phoneNumber);
}
