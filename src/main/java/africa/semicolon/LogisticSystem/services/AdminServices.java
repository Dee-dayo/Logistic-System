package africa.semicolon.LogisticSystem.services;

import africa.semicolon.LogisticSystem.data.models.Order;
import africa.semicolon.LogisticSystem.data.models.User;
import africa.semicolon.LogisticSystem.dto.requests.OrderPaymentRequest;
import africa.semicolon.LogisticSystem.dto.requests.RiderRegisterRequest;
import africa.semicolon.LogisticSystem.dto.requests.SendOrderRequest;
import africa.semicolon.LogisticSystem.dto.requests.UserRegisterRequest;
import africa.semicolon.LogisticSystem.dto.response.*;

import java.util.List;

public interface AdminServices {
    Long findNoOfUsers();
    UserRegisterResponse register(UserRegisterRequest userRegisterRequest);
    Long findNoOfRiders();
    Order takeOrder(User user, SendOrderRequest sendOrderRequest);
    Long noOfOrders();
    int findAvailableRiders();
    void collectOrderFromSender(OrderPaymentRequest orderPaymentRequest);
//    List<Order> getAllOrders();
    List<OrderResponse> getAllUsersOrders();
    RiderRegisterResponse register(RiderRegisterRequest riderRegisterRequest);

    List<AdminUsersResponse> getAllUsers();

    List<AdminRidersResponse> getAllRiders();
}
