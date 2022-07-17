package net.optifine.features.module.combat;

import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.managers.event.events.PacketOutputListener;
import net.optifine.managers.event.events.PacketOutputListener.PacketOutputEvent;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.mixinterface.IArmorItem;
import net.optifine.util.gui.Translatable;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public final class AutoArmor extends Module implements UpdateListener, PacketOutputListener {
   // $FF: synthetic field
   private final NumberSetting Harry;
   // $FF: synthetic field
   private final BooleanSetting Jacob;
   // $FF: synthetic field
   private int Charlie;
   // $FF: synthetic field
   private final BooleanSetting Jack = new BooleanSetting("No Moving", false);

   public void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      EVENT_MANAGER.Oliver(PacketOutputListener.class, this);
      this.Charlie = 0;
      "".length();
      if ("".length() <= " ".length()) {
         ;
      }
   }

   static {
      "".length();
      if ("   ".length() >= -" ".length()) {
         ;
      }
   }

   public void Thomas() {
      if (this.Charlie > 0) {
         --this.Charlie;
         "".length();
         if (-"  ".length() > 0) {
            return;
         }
      } else if (mc.field_1755 instanceof class_465 && !(mc.field_1755 instanceof class_490)) {
         "".length();
         if ("".length() > 0) {
            return;
         }
      } else {
         class_746 player = mc.field_1724;
         class_1661 inventory = player.field_7514;
         if (this.Jack.Jack() || lIllIllIIl(player.field_3913.field_3905, 0.0F) == 0 && lIllIllIIl(player.field_3913.field_3907, 0.0F) == 0) {
            int[] bestArmorSlots = new int[4];
            int[] bestArmorValues = new int[4];
            int slot = 0;

            class_1799 stack;
            class_1738 item;
            while(slot < 4) {
               bestArmorSlots[slot] = -1;
               stack = inventory.method_7372(slot);
               if (!stack.method_7960()) {
                  if (!(stack.method_7909() instanceof class_1738)) {
                     "".length();
                     if (null != null) {
                        return;
                     }
                  } else {
                     item = (class_1738)stack.method_7909();
                     bestArmorValues[slot] = this.Oliver(item, stack);
                  }
               }

               ++slot;
               "".length();
               if (-" ".length() > (125 ^ 57 ^ 11 ^ 75)) {
                  return;
               }
            }

            slot = 0;

            while(true) {
               byte var10001;
               if (this.Jacob.Jack()) {
                  var10001 = 9;
                  "".length();
                  if (-" ".length() >= "".length()) {
                     return;
                  }
               } else {
                  var10001 = 36;
               }

               int slot;
               if (slot >= var10001) {
                  ArrayList<Integer> types = new ArrayList(Arrays.asList(0, 1, 2, 3));
                  Collections.shuffle(types);
                  Iterator var11 = types.iterator();

                  label94:
                  while(true) {
                     while(true) {
                        if (!var11.hasNext()) {
                           break label94;
                        }

                        int type = (Integer)var11.next();
                        slot = bestArmorSlots[type];
                        if (slot != -1) {
                           class_1799 oldArmor = inventory.method_7372(type);
                           if (oldArmor.method_7960() || inventory.method_7376() != -1) {
                              if (slot < 9) {
                                 slot += 36;
                              }

                              if (!oldArmor.method_7960()) {
                                 IMC.getInteractionManager().windowClick_QUICK_MOVE(8 - type);
                                 "".length();
                              }

                              IMC.getInteractionManager().windowClick_QUICK_MOVE(slot);
                              "".length();
                              "".length();
                              if ((51 ^ 55) == -" ".length()) {
                                 return;
                              }
                              break label94;
                           }

                           "".length();
                           if (null != null) {
                              return;
                           }
                        } else {
                           "".length();
                           if (-" ".length() >= 0) {
                              return;
                           }
                        }
                     }
                  }

                  "".length();
                  if (null != null) {
                     return;
                  }
                  break;
               }

               stack = inventory.method_5438(slot);
               if (!stack.method_7960()) {
                  if (!(stack.method_7909() instanceof class_1738)) {
                     "".length();
                     if ("  ".length() != "  ".length()) {
                        return;
                     }
                  } else {
                     item = (class_1738)stack.method_7909();
                     slot = item.method_7685().method_5927();
                     int armorValue = this.Oliver(item, stack);
                     if (armorValue > bestArmorValues[slot]) {
                        bestArmorSlots[slot] = slot;
                        bestArmorValues[slot] = armorValue;
                     }
                  }
               }

               ++slot;
               "".length();
               if (" ".length() <= 0) {
                  return;
               }
            }
         } else {
            "".length();
            if (-" ".length() >= "  ".length()) {
               return;
            }
         }
      }

   }

   public String Oliver() {
      String var1 = String.valueOf((new StringBuilder()).append(this.Harry.Jack()).append(""));
      "".length();
      return (1 ^ 78 ^ 105 ^ 35) <= 0 ? null : var1;
   }

   public void onSentPacket(PacketOutputEvent event) {
      if (event.Jacob() instanceof class_2813) {
         this.Charlie = this.Harry.Oscar();
      }

      "".length();
      if (-"   ".length() <= 0) {
         ;
      }
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      EVENT_MANAGER.Jack(PacketOutputListener.class, this);
      "".length();
      if (" ".length() > 0) {
         ;
      }
   }

   private int Oliver(class_1738 item, class_1799 stack) {
      int armorPoints = item.method_7687();
      int armorToughness = (int)((IArmorItem)item).getToughness();
      int armorType = item.method_7686().method_7697(class_1304.field_6172);
      class_1887 protection = class_1893.field_9111;
      int prtLvl = class_1890.method_8225(protection, stack);
      class_746 player = mc.field_1724;
      class_1282 dmgSource = class_1282.method_5532(player);
      int prtPoints = protection.method_8181(prtLvl, dmgSource);
      int var11 = armorPoints * 5 + prtPoints * 3 + armorToughness + armorType;
      "".length();
      return null != null ? "".length() : var11;
   }

   public AutoArmor() {
      super("AutoArmor", Translatable.AUTOARMOR_DESC, Category.Oliver);
      this.Harry = new NumberSetting("Delay", Translatable.AUTOARMOR_DELAY, 2.0D, 0.0D, 20.0D, 1.0D);
      this.Jacob = new BooleanSetting("HotBar Armor Only", false);
      this.addSetting(this.Harry);
      this.addSetting(this.Jack);
      this.addSetting(this.Jacob);
      "".length();
      if (null != null) {
         throw null;
      }
   }

   private static int lIllIllIIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }
}
