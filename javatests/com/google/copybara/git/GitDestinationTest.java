import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
  private GitDestination destinationFirstCommit()
    return yaml.withOptions(options.build(), CONFIG_NAME);
    return yaml.withOptions(options.build(), CONFIG_NAME /*askConfirmation*/);
    processWithBaselineAndConfirmation(destination, originRef, baseline,
        /*askForConfirmation*/false);
  }

  private void processWithBaselineAndConfirmation(GitDestination destination,
      DummyReference originRef,
      String baseline, boolean askForConfirmation)
      throws ConfigValidationException, RepoException, IOException {

    if (askForConfirmation) {
      result = result.withAskForConfirmation(true);
    }
    processWithBaselineAndConfirmation(destinationFirstCommit(), new DummyReference("origin_ref"),
        /*baseline=*/null, /*askForConfirmation=*/true);
    processWithBaselineAndConfirmation(destinationFirstCommit(), new DummyReference("origin_ref"),
        /*baseline=*/null, /*askForConfirmation=*/true);
    console.assertThat()