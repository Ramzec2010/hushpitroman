public class ServiceServerImpl extends UnicastRemoteObject implements ServiceServer {

    HashMap serviseList;

    public ServiceServerImpl() throws RemoteException {
        setUpServices();
    }

    private void setUpServices() {
        serviseList = new HashMap();
        serviseList.put("Dise Rolling Service", new DiseService());
        serviseList.put("Day of the week Service", new DayOfWeekService());
        serviseList.put("Visual Music Service", new MiniMusicService());
    }

    @Override
    public Object[] getServiceList() {
        System.out.println("in remote");
        return serviseList.keySet().toArray();
    }

    @Override
    public Service getService(Object serviceKey) throws RemoteException {
        Service theService = (Service) serviseList.get(serviceKey);
        return theService;
    }

    public static void main(String[] args) {
        try {
            Naming.rebind("ServiceServer", new ServiceServerImpl());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Remote service is running");
    }
}
