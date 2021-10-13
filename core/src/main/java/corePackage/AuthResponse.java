package corePackage;

public class AuthResponse  extends AbstractCommand{

    private boolean authStatus;

    public boolean getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(boolean authStatus) {
        this.authStatus = authStatus;
    }

    @Override
    public CommandType getType() {
        return CommandType.AUTH_RESPONSE;
    }
}