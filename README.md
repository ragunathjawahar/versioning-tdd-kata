# Versioning TDD Kata
Today is your first day at your favorite organization, and your team is automating the release process for an application. Usually, they use SemVer for versioning software. However, this time they want to try out a different approach. Everyone in your team is working on various aspects of automating the process, and your responsibility is to implement the new versioning scheme.

The team does two kinds of releases - public and internal. And each of these has its format.

## Public releases
Public releases use the following format - `[YYYY].[published-artifact-count]`.

Where `[YYYY]` denotes the current year, and `[published-artifact-count]` represents the number of public releases made this year.

For example, the first public release for the year 2021 would be `2021.1`, and the second release would be `2021.2`, and so on.

## Internal releases
Your team does not distribute internal releases to customers, and they have the following extended format - `[YYYY].[published-artifact-count].[build-number]`.

`[YYYY]` and `[published-artifact-count]` is the same as in public releases. `[build-number]` is the number of internal releases made after the last public release and starts from `1` after every public release.

For example, the first internal release for 2021 without any public releases would be `2021.0.1`; the second internal release would be `2021.0.2` and so on. Each internal release will increment its `[build-number]` by `1`.

## Releases summary
In general, public releases drop the `[build-number]` from internal releases and increment the `[published-artifact-count]` by `1`
(i.e.), if `2021.3.45` is the latest internal version; the public release will be `2021.4`.

Your team has high hopes for you to deliver this feature with utmost quality. Good luck!

## References
### 3 laws of TDD
1. Do not write production code unless it is to make a failing test pass.
2. Do not write any more of a unit test that is sufficient to fail. Compilation errors are failures.
3. Do not write more production code than is necessary to make a failing unit test pass.

## License

    Copyright 2021 @ragunathjawahar

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
