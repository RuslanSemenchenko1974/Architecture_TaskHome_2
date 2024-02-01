public class GenGoldRevard implements GenItem {
    @Override
    public IGameItem createItem() {
       return new GoldRevard();
        
    }
}
