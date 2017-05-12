package camp.xit.auth.services.ldap;

import camp.xit.auth.services.model.AccountInfo;
import camp.xit.auth.services.model.CreateAccountData;
import com.unboundid.ldap.sdk.LDAPException;
import org.apache.cxf.rs.security.oidc.common.UserInfo;
import org.osgi.service.event.EventHandler;

public interface UserLdapService extends EventHandler {

    boolean accountExists(String subject) throws LDAPException;


    AccountInfo getAccountInfo(String subject) throws LDAPException;


    void createAccount(UserInfo userInfo, CreateAccountData createData) throws LDAPException;


    void updateAccount(UserInfo userInfo, CreateAccountData createData) throws LDAPException;
}