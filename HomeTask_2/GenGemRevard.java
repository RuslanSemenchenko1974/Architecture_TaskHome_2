public class GenGemRevard implements GenItem{

    @Override
    public IGameItem createItem() {
        return new GemRevard();
    }
    
}
