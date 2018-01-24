package webdriver.web;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import logging.Logging;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static java.lang.String.format;

public enum Browser implements Initializable, HasCapabilities, Logging {


  CHROME {
    @Override
    public void initialize() {
      INITIALIZED.computeIfAbsent(ordinal(), n -> {
        ChromeDriverManager.getInstance().setup();
        return true;
      });
    }

    @Override
    public Capabilities getCapabilities() {
      return DesiredCapabilities.chrome();
    }

  },

  FIREFOX {
    @Override
    public void initialize() {
      INITIALIZED.computeIfAbsent(ordinal(), n -> {
        FirefoxDriverManager.getInstance().setup();
        return true;
      });
    }

    @Override
    public Capabilities getCapabilities() {
      return DesiredCapabilities.firefox();
    }
  },
  IE {
    @Override
    public void initialize() {
      INITIALIZED.computeIfAbsent(ordinal(), n -> {
        InternetExplorerDriverManager.getInstance().arch32().setup();
        return true;
      });
    }

    @Override
    public Capabilities getCapabilities() {
      return DesiredCapabilities.internetExplorer();
    }
  },
  EDGE {
    @Override
    public void initialize() {
      INITIALIZED.computeIfAbsent(ordinal(), n -> {
        EdgeDriverManager.getInstance().setup();
        return true;
      });
    }

    @Override
    public Capabilities getCapabilities() {
      return DesiredCapabilities.edge();
    }
  };

  private static final Map<Integer, Boolean> INITIALIZED = new ConcurrentHashMap<>();

  Browser() {
    getLogger().info(format("Initializing configuration for browser [%s]...", name()));
  }

}