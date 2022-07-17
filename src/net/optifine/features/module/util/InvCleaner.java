package net.optifine.features.module.util;

import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.mixinterface.IArmorItem;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class InvCleaner extends Module implements UpdateListener {
   // $FF: synthetic field
   BooleanSetting Jack = new BooleanSetting("Open Inventory", true);
   // $FF: synthetic field
   BooleanSetting Jacob = new BooleanSetting("Tools", true);
   // $FF: synthetic field
   BooleanSetting Thomas = new BooleanSetting("Bows", true);
   // $FF: synthetic field
   BooleanSetting George = new BooleanSetting("Projectiles", true);
   // $FF: synthetic field
   BooleanSetting Harry = new BooleanSetting("Swords", true);
   // $FF: synthetic field
   BooleanSetting Charlie = new BooleanSetting("Armor", true);

   public void Thomas() {
      if (!this.Jack.Jack() || mc.field_1755 instanceof class_465 && !(mc.field_1755 instanceof class_490)) {
         LinkedHashMap<Integer, Float> swords = new LinkedHashMap();
         LinkedHashMap<Integer, Float> picks = new LinkedHashMap();
         LinkedHashMap<Integer, Float> axes = new LinkedHashMap();
         LinkedHashMap<Integer, Float> shovels = new LinkedHashMap();
         LinkedHashMap<Integer, Float> helmets = new LinkedHashMap();
         LinkedHashMap<Integer, Float> chestplates = new LinkedHashMap();
         LinkedHashMap<Integer, Float> leggings = new LinkedHashMap();
         LinkedHashMap<Integer, Float> boots = new LinkedHashMap();
         LinkedHashMap<Integer, Float> bows = new LinkedHashMap();
         LinkedHashMap<Integer, Float> snowballs = new LinkedHashMap();
         LinkedHashMap<Integer, Float> arrows = new LinkedHashMap();
         int i = 0;

         while(i < 45) {
            class_1799 is = mc.field_1724.field_7514.method_5438(i);
            class_1792 it = is.method_7909();
            if (it instanceof class_1829) {
               swords.put(i, ((class_1829)it).method_8020());
               "".length();
            }

            if (it instanceof class_1810) {
               picks.put(i, ((class_1810)it).method_8022().method_8027());
               "".length();
            }

            if (it instanceof class_1743) {
               axes.put(i, ((class_1743)it).method_8022().method_8027());
               "".length();
            }

            if (it instanceof class_1821) {
               shovels.put(i, ((class_1821)it).method_8022().method_8027());
               "".length();
            }

            if (it instanceof class_1753) {
               bows.put(i, 0.0F);
               "".length();
            }

            if (it instanceof class_1823) {
               snowballs.put(i, (float)is.method_7947());
               "".length();
            }

            if (it instanceof class_1744) {
               arrows.put(i, (float)is.method_7947());
               "".length();
            }

            if (it instanceof class_1738) {
               switch(((class_1738)it).method_7685()) {
               case field_6169:
                  helmets.put(i, (float)this.Oliver((class_1738)it, is));
                  "".length();
                  "".length();
                  if ("".length() != 0) {
                     return;
                  }
                  break;
               case field_6174:
                  chestplates.put(i, (float)this.Oliver((class_1738)it, is));
                  "".length();
                  "".length();
                  if ("  ".length() == 0) {
                     return;
                  }
                  break;
               case field_6172:
                  leggings.put(i, (float)this.Oliver((class_1738)it, is));
                  "".length();
                  "".length();
                  if (" ".length() <= 0) {
                     return;
                  }
                  break;
               case field_6166:
                  boots.put(i, (float)this.Oliver((class_1738)it, is));
                  "".length();
               }
            }

            ++i;
            "".length();
            if ("  ".length() != "  ".length()) {
               return;
            }
         }

         if (this.Harry.Jack() && this.Oliver(swords)) {
            "".length();
            if (-(184 ^ 188) >= 0) {
               return;
            }
         } else if (this.Jacob.Jack() && this.Oliver(picks)) {
            "".length();
            if ("  ".length() <= 0) {
               return;
            }
         } else if (this.Jacob.Jack() && this.Oliver(axes)) {
            "".length();
            if (" ".length() <= -" ".length()) {
               return;
            }
         } else if (this.Jacob.Jack() && this.Oliver(shovels)) {
            "".length();
            if ("   ".length() != "   ".length()) {
               return;
            }
         } else if (this.Charlie.Jack() && this.Oliver(helmets)) {
            "".length();
            if ("  ".length() <= 0) {
               return;
            }
         } else if (this.Charlie.Jack() && this.Oliver(chestplates)) {
            "".length();
            if ((248 ^ 144 ^ 205 ^ 160) == 0) {
               return;
            }
         } else if (this.Charlie.Jack() && this.Oliver(leggings)) {
            "".length();
            if ("".length() > "".length()) {
               return;
            }
         } else if (this.Charlie.Jack() && this.Oliver(boots)) {
            "".length();
            if ((89 ^ 51 ^ 114 ^ 28) < -" ".length()) {
               return;
            }
         } else if (this.Thomas.Jack() && this.Oliver(bows)) {
            "".length();
            if (-"   ".length() >= 0) {
               return;
            }
         } else if (this.George.Jack() && this.Oliver(snowballs)) {
            "".length();
            if ("  ".length() == "   ".length()) {
               return;
            }
         } else if (this.George.Jack() && this.Oliver(arrows)) {
            "".length();
            if (" ".length() >= "  ".length()) {
               return;
            }
         } else {
            "".length();
            if ("".length() < -" ".length()) {
               return;
            }
         }
      } else {
         "".length();
         if ("".length() == -" ".length()) {
            return;
         }
      }

   }

   private boolean Oliver(LinkedHashMap<Integer, Float> data) {
      boolean var3;
      if (data.size() > 1) {
         data = (LinkedHashMap)data.entrySet().stream().sorted(Entry.comparingByValue()).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> {
            "".length();
            return " ".length() == 0 ? null : e1;
         }, LinkedHashMap::new));
         int i = (Integer)data.keySet().iterator().next();
         if (i < 9) {
            i += 36;
         }

         Global.Jack.getInteractionManager().windowClick_THROW(i);
         "".length();
         var3 = true;
         "".length();
         if ("  ".length() >= "   ".length()) {
            return (boolean)"".length();
         }
      } else {
         var3 = false;
         "".length();
         if (-" ".length() > 0) {
            return (boolean)"".length();
         }
      }

      return var3;
   }

   static {
      "".length();
      if (null == null) {
         ;
      }
   }

   public InvCleaner() {
      super("InvCleaner", "Cleans your inventory.", Category.Charlie);
      this.addSetting(this.Jack);
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      this.addSetting(this.Thomas);
      this.addSetting(this.George);
      "".length();
      if (null != null) {
         throw null;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if ("  ".length() == "  ".length()) {
         ;
      }
   }

   private int Oliver(class_1738 item, class_1799 stack) {
      int armorPoints = item.method_7687();
      int armorToughness = (int)((IArmorItem)item).getToughness();
      int armorType = item.method_7686().method_7697(class_1304.field_6172);
      class_1887 protection = class_1893.field_9111;
      int prtLvl = class_1890.method_8225(protection, stack);
      class_1282 dmgSource = class_1282.method_5532(mc.field_1724);
      int prtPoints = protection.method_8181(prtLvl, dmgSource);
      int var10 = armorPoints * 5 + prtPoints * 3 + armorToughness + armorType;
      "".length();
      return -(210 ^ 193 ^ 70 ^ 81) >= 0 ? "".length() : var10;
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if (" ".length() > 0) {
         ;
      }
   }
}
