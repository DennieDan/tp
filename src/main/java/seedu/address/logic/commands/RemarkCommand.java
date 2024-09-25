package seedu.address.logic.commands;

import seedu.address.model.Model;

/**
 * Changes the remark of an existing person in the address book.
 */
public class RemarkCommand extends Command {

    public static final String COMMAND_WORD = "remark";
    public static final String MESSAGE_USAGE = COMMAND_WORD;
    public static final String MESSAGE_NOT_IMPLEMENTED_YET = "Remarked unsuccessfully";

    @Override
    public CommandResult execute(Model model) {
        return new CommandResult("Hello from remark");
    }

}
