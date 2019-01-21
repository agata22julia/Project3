package springboot.my_first_application.controller;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import springboot.my_first_application.model.Shipwreck;

public class ShipwreckStub {
  private static Map<Long, Shipwreck> wrecks = new HashMap<Long, Shipwreck>();
  private static Long idIndex = 3L;
  static {
    Shipwreck a = new Shipwreck(1L, "Langley", "United States Navy's first aircraft carrier", "FAIR", 200, 44.12, 138.44, 1942);
    wrecks.put(1L, a);
    Shipwreck b = new Shipwreck(2L, "Chicago", "Northampton-class cruiser of the United States Navy that served in the Pacific Theater", "GOOD", 80, 44.12, 138.44, 1943);
    wrecks.put(2L, b);
    Shipwreck c = new Shipwreck(3L, "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 50, 44.12, 138.44, 1994);
    wrecks.put(3L, c);
  }
  public static ArrayList<Shipwreck> list() {
    return new ArrayList<Shipwreck>(wrecks.values());
  }
  public static Shipwreck create(Shipwreck wreck) {
    idIndex += idIndex;
    wreck.setId(idIndex);
    wrecks.put(idIndex, wreck);
    return wreck;
  }
  public static Shipwreck get(Long id) {
    return wrecks.get(id);
  }
  public static Shipwreck update(Long id, Shipwreck wreck) {
    wrecks.put(id, wreck);
    return wreck;
  }
  public static Shipwreck delete(Long id) {
    return wrecks.remove(id);
  }
}
