package cn.ltysyn.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class MyRealm extends AuthorizingRealm {

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}
	
//	@Autowired
//	private IUserExtendDao userExtendDao;
//
//	@Override
//	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
//		// TODO Auto-generated method stub
//		String username = (String) arg0.getPrimaryPrincipal();
//		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
//		Set<String> roleName = new HashSet<>(userExtendDao.getRoles(username));
//		Set<String> permissions = new HashSet<>(userExtendDao.getPermissions(username));
//		authorizationInfo.setRoles(roleName);
//		authorizationInfo.setStringPermissions(permissions);
//		return authorizationInfo;
//	}
//
//	/**
//	 * 用于验证用户信息
//	 */
//	@Override
//	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
//		// TODO Auto-generated method stub
//		String username = (String) arg0.getPrincipal();
//		User user = userExtendDao.selectByUsername(username);
//		if (null != user) {
//			AuthenticationInfo info = new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), "xx");
//			return info;
//		}
//		return null;
//	}
	
	

}
