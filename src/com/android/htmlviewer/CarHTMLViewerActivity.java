/*
 * Copyright (C) 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.htmlviewer;

import android.webkit.WebView;

import com.android.car.ui.core.CarUi;
import com.android.car.ui.toolbar.NavButtonMode;
import com.android.car.ui.toolbar.ToolbarController;

/**
 * An HTMLViewerActivity used for car builds.
 */
public class CarHTMLViewerActivity extends HTMLViewerActivity {
    private ToolbarController mToolbar;

    @Override
    protected void setContentView() {
        setContentView(R.layout.main_car);
        WebView webView = requireViewById(R.id.webview);
        webView.setDefaultFocusHighlightEnabled(false);
        mToolbar = CarUi.requireToolbar(this);
        mToolbar.setNavButtonMode(NavButtonMode.BACK);
    }

    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
        mToolbar.setTitle(title);
    }
}
