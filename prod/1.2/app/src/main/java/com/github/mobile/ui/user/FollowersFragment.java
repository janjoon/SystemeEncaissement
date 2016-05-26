/*
 * Copyright 2012 GitHub Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.mobile.ui.user;

import android.os.Bundle;

import com.github.mobile.R.string;

/**
 * Fragment to display a list of followers
 */
public abstract class FollowersFragment extends PagedUserFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setEmptyText(string.no_followers);
    }

    @Override
    protected int getLoadingMessage() {
        return string.loading_followers;
    }

    @Override
    protected int getErrorMessage(Exception exception) {
        return string.error_followers_load;
    }
}
