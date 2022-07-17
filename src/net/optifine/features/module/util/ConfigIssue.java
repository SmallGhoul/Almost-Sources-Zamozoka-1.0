package net.optifine.features.module.util;

import net.optifine.Global;
import net.optifine.config.*;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import net.optifine.features.module.hud.ArrayListModule;
import net.optifine.features.module.hud.ClickGuiModule;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ConfigIssue extends Module implements UpdateListener {
   protected void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if ("  ".length() != 0) {
         ;
      }
   }

   static {
      "".length();
      if ((65 ^ 69) != "".length()) {
         ;
      }
   }

   public ConfigIssue() {
      super("ConfigIssue", "Config Issue", Category.Charlie);
      "".length();
      if (-" ".length() > 0) {
         throw null;
      }
   }

   private Module George() {
      List<Module> modules = new ArrayList(Global.Jack().Oliver());
      Module m = (Module)modules.get(ThreadLocalRandom.current().nextInt(modules.size()));
      Module var3;
      if (!(m instanceof Panic) && !(m instanceof ConfigIssue)) {
         var3 = m;
         "".length();
         if ("  ".length() > "   ".length()) {
            return null;
         }
      } else {
         var3 = this.George();
         "".length();
         if ("".length() != "".length()) {
            return null;
         }
      }

      return var3;
   }

   public void Thomas() {
      Module module = this.George();
      boolean var10001;
      if (ThreadLocalRandom.current().nextBoolean() && !(module instanceof ArrayListModule) && !(module instanceof ClickGuiModule)) {
         if (!module.isEnabled()) {
            var10001 = true;
            "".length();
            if ("   ".length() <= "".length()) {
               return;
            }
         } else {
            var10001 = false;
         }

         module.Jack(var10001);
         "".length();
         if (" ".length() >= "   ".length()) {
            return;
         }
      } else {
         Setting s = this.Oliver(module);
         if (s instanceof NumberSetting) {
            NumberSetting setting = (NumberSetting)s;
            setting.Oliver(ThreadLocalRandom.current().nextDouble(setting.Mary(), setting.Patricia()));
            "".length();
            if ((100 ^ 96) < 0) {
               return;
            }
         } else if (s instanceof BooleanSetting) {
            BooleanSetting setting = (BooleanSetting)s;
            if (!setting.Jack()) {
               var10001 = true;
               "".length();
               if (" ".length() < 0) {
                  return;
               }
            } else {
               var10001 = false;
            }

            setting.Oliver(var10001);
            "".length();
            if ("".length() != "".length()) {
               return;
            }
         } else if (s instanceof EnumSetting) {
            EnumSetting setting = (EnumSetting)s;
            Enum[] values = setting.Jack();
            setting.Oliver(values[ThreadLocalRandom.current().nextInt(values.length)]);
            "".length();
            if ("".length() != 0) {
               return;
            }
         } else if (s instanceof ColorPickerSetting) {
            ColorPickerSetting setting = (ColorPickerSetting)s;
            setting.Oliver(ThreadLocalRandom.current().nextFloat());
            setting.Jack(ThreadLocalRandom.current().nextFloat());
            setting.Harry(ThreadLocalRandom.current().nextFloat());
         }
      }

      "".length();
      if ("   ".length() <= "   ".length()) {
         ;
      }
   }

   private Setting Oliver(Module m) {
      List<Setting> settings = new ArrayList(m.getSettings().values());
      Setting var3;
      if (settings.size() < 1) {
         var3 = null;
         "".length();
         if (" ".length() != " ".length()) {
            return null;
         }
      } else {
         var3 = (Setting)settings.get(ThreadLocalRandom.current().nextInt(settings.size()));
         "".length();
         if ((188 ^ 184) < 0) {
            return null;
         }
      }

      return var3;
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if (" ".length() != 0) {
         ;
      }
   }
}
