package f2p.woodcutting;

import lombok.RequiredArgsConstructor;
import lombok.AccessLevel;
import lombok.Getter;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
public enum Constants 
{
    REGULAR(1, "Tree"),
    OAK(15, "Oak"),
    WILLOW(30, "Willow");

    private final int level;
    private final String name;
}
