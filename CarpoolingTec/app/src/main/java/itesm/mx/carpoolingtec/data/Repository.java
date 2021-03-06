package itesm.mx.carpoolingtec.data;

import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import itesm.mx.carpoolingtec.model.firebase.Contact;
import itesm.mx.carpoolingtec.model.firebase.Ride;
import itesm.mx.carpoolingtec.model.firebase.User;
import itesm.mx.carpoolingtec.model.firebase.UserRide;

public interface Repository {

    Observable<Contact> getContacts(String userId);

    Observable<UserRide> getUserRides(int rideType);

    Completable saveRide(User user, Ride ride);

    Single<User> getUser(String id);

    void saveMyId(String id);

    String getMyId();
}
