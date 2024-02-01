package in.swapnilkale.service;

import java.util.Map;

import in.swapnilkale.bindings.LoginForm;
import in.swapnilkale.bindings.RegisterForm;
import in.swapnilkale.bindings.ResetPwdForm;
import in.swapnilkale.entity.User;

public interface UserService {

	public Map<Integer, String> getCountries();

	public Map<Integer, String> getStates(Integer countryId);

	public Map<Integer, String> getCities(Integer stateId);

	public User getUser(String email);

	public boolean saveUser(RegisterForm formObj);

	public User login(LoginForm formObj);

	public boolean resetPwd(ResetPwdForm formObj);

}
