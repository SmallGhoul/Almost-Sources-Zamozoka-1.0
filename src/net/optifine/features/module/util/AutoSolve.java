package net.optifine.features.module.util;

import net.optifine.config.NumberSetting;
import net.optifine.managers.event.events.ChatInputListener;
import net.optifine.managers.event.events.ChatInputListener.ChatInputEvent;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AutoSolve extends Module implements ChatInputListener, UpdateListener {
   // $FF: synthetic field
   ConcurrentHashMap<Long, String> Harry = new ConcurrentHashMap();
   // $FF: synthetic field
   NumberSetting Jack = new NumberSetting("Delay", 0.0D, 0.0D, 10000.0D, 50.0D);
   // $FF: synthetic field
   int Jacob = 0;
   // $FF: synthetic field
   private final String Charlie = "(([(-/]+)*([1-9]+([(-/]+))+[1-9]+)";

   private static int llllIlIIIl(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(ChatInputListener.class, this);
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if ((115 ^ 23 ^ 222 ^ 190) >= 0) {
         ;
      }
   }

   public void Oliver(ChatInputEvent event) {
      String msg = event.Jacob().getString();
      StringBuilder maths = new StringBuilder();
      Pattern pattern = Pattern.compile("(([(-/]+)*([1-9]+([(-/]+))+[1-9]+)", 2);
      Matcher matcher = pattern.matcher(msg);

      while(matcher.find()) {
         maths.append(msg.substring(matcher.start(), matcher.end()));
         "".length();
         "".length();
         if (-" ".length() >= 0) {
            return;
         }
      }

      if (!String.valueOf(maths).isEmpty()) {
         label24: {
            try {
               ScriptEngineManager manager = new ScriptEngineManager();
               ScriptEngine engine = manager.getEngineByName("nashorn");
               this.Harry.put((long)this.Jacob, String.valueOf(engine.eval(String.valueOf(maths))));
               "".length();
            } catch (Exception var8) {
               var8.printStackTrace();
               break label24;
            }

            "".length();
            if ("".length() <= -" ".length()) {
               return;
            }
         }
      }

      "".length();
      if (" ".length() > -" ".length()) {
         ;
      }
   }

   public void Thomas() {
      ++this.Jacob;
      if (!this.Harry.isEmpty()) {
         if (this.Jack.Oscar() == 0) {
            Iterator var1 = this.Harry.entrySet().iterator();

            while(var1.hasNext()) {
               Entry<Long, String> answerEntry = (Entry)var1.next();
               if (mc.field_1724 != null) {
                  mc.field_1724.method_3142((String)answerEntry.getValue());
               }

               "".length();
               if (" ".length() == 0) {
                  return;
               }
            }

            this.Harry.clear();
            "".length();
            if ("".length() > (82 + 82 - 34 + 45 ^ 117 + 142 - 172 + 84)) {
               return;
            }
         } else {
            int delayInTicks = this.Jack.Oscar() / 50;
            Iterator var5 = this.Harry.entrySet().iterator();

            while(var5.hasNext()) {
               Entry<Long, String> answerEntry = (Entry)var5.next();
               if (llllIlIIIl((long)this.Jacob - (Long)answerEntry.getKey(), (long)delayInTicks) >= 0 && mc.field_1724 != null) {
                  mc.field_1724.method_3142((String)answerEntry.getValue());
                  this.Harry.remove(answerEntry.getKey());
                  "".length();
               }

               "".length();
               if ("".length() > "".length()) {
                  return;
               }
            }
         }
      }

      "".length();
      if (null == null) {
         ;
      }
   }

   public AutoSolve() {
      super("AutoSolve", "Automatically gives answers for math char-games. \nMay not work on newer java versions", Category.Charlie);
      "".length();
      if (null != null) {
         throw null;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(ChatInputListener.class, this);
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if (null == null) {
         ;
      }
   }

   static {
      "".length();
      if (null == null) {
         ;
      }
   }
}
