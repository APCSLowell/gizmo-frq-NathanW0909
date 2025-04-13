import java.util.ArrayList;

public class OnlinePurchaseManager {

  private ArrayList<Gizmo> purchases;

  public OnlinePurchaseManager() {
    purchases = new ArrayList<>();
  }

  public void add(Gizmo g) {
    purchases.add(g);
  }

  public int countElectronicsByMaker(String maker) {
    int total = 0;
    for (Gizmo g : purchases) {
      if (g.isElectronic() && g.getMaker().equals(maker)) {
        total++;
      }
    }
    return total;
  }

  public boolean hasAdjacentEqualPair() {
    for (int i = 1; i < purchases.size(); i++) {
      if (purchases.get(i).equals(purchases.get(i - 1))) {
        return true;
      }
    }
    return false;
  }
}
